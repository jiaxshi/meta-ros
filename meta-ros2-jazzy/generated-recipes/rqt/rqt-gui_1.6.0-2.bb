# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "rqt_gui provides the main to start an instance of the ROS integrated graphical user interface provided by qt_gui."
AUTHOR = "Dharini Dutia <dharini@openrobotics.org>"
ROS_AUTHOR = "Dirk Thomas"
HOMEPAGE = "http://ros.org/wiki/rqt_gui"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt"
ROS_BPN = "rqt_gui"

ROS_BUILD_DEPENDS = " \
    qt-gui \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    python-qt-binding \
    python3-catkin-pkg \
    qt-gui \
    rclpy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rqt-release/archive/release/jazzy/rqt_gui/1.6.0-2.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/rqt_gui"
SRC_URI = "git://github.com/ros2-gbp/rqt-release;${ROS_BRANCH};protocol=https"
SRCREV = "8eec9c6a8d6951524a0d1fe98f9640ef8ef40267"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
